<template>
    <div class="table">
        <div class="crumbs">
            <el-breadcrumb separator="/">
                <el-breadcrumb-item><i class="el-icon-lx-cascades"></i> 医生信息</el-breadcrumb-item>
            </el-breadcrumb>
        </div>
        <div class="container">
            <div class="handle-box">
                <el-button type="primary" icon="delete" class="handle-del mr10" @click="delAll">批量删除</el-button>
                <el-select v-model="select_cate" placeholder="筛选医生" class="handle-select mr10">
                    <el-option v-for="item in tableData"
                               :key="item.dNum"
                               :label="item.dName"
                               :value="item"/>

                </el-select>
                <el-input v-model="select_word" placeholder="筛选关键词" class="handle-input mr10"></el-input>
                <el-button type="primary" icon="search" @click="search">搜索</el-button>
            </div>
            <el-table :data="tableData" border class="table" ref="multipleTable" @selection-change="handleSelectionChange" :key="tableData.dId">
                <el-table-column type="selection" width="55" align="center"></el-table-column>
                <el-table-column prop="dNum" label="编号" sortable width="150">
                </el-table-column>
                <el-table-column prop="dName" label="姓名" width="120">
                </el-table-column>
                <el-table-column prop="doctorlv.dlname" label="医生级别" width="120">
                </el-table-column>
                <el-table-column prop="dEmail" label="医生邮箱" >
                </el-table-column>
                <el-table-column prop="dTel" label="联系电话" :formatter="formatter">
                </el-table-column>
                <el-table-column prop="dept.deName" label="所在科室" width="120">
                </el-table-column>
                <el-table-column label="操作" width="180" align="center">
                    <template slot-scope="scope">
                        <el-button type="text" icon="el-icon-edit" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                        <el-button type="text" icon="el-icon-delete" class="red" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                    </template>
                </el-table-column>
            </el-table>
            <div class="pagination">
                <el-pagination background @current-change="handleCurrentChange" layout="prev, pager, next" :total="100">
                </el-pagination>
            </div>
        </div>

        <!-- 编辑弹出框 -->
        <el-dialog title="编辑" :visible.sync="editVisible" width="30%">
            <el-form ref="form" :model="form" label-width="50px">
                <el-form-item label="编号">
                    <el-input  v-model="form.dNum" />
                </el-form-item>
                <el-form-item label="姓名">
                    <el-input v-model="form.dName"></el-input>
                </el-form-item>
                <el-form-item label="性别">
                    <el-input v-model="form.dSex"></el-input>
                </el-form-item>

                <el-form-item label="医生级别">
                    <el-select v-model="form.doctorlv"  placeholder="医生等级" class="handle-select mr10">
                        <option v-for="item in form.doctorlv"
                                :key="item.dlid"
                                :label="item.dlname"
                                :value="item"></option>
                    </el-select>
                    <!--<el-input v-model="form.doctorlv"></el-input>-->
                </el-form-item>
                <el-form-item label="所属部门">
                    <el-input v-model="form.dDept.deName"></el-input>
                </el-form-item>
                <el-form-item label="医生邮箱">
                    <el-input v-model="form.dEmail"></el-input>
                </el-form-item>

                <el-form-item label="联系方式">
                    <el-input v-model="form.dTel"></el-input>
                </el-form-item>

            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="editVisible = false">取 消</el-button>
                <el-button type="primary" @click="saveEdit">确 定</el-button>
            </span>
        </el-dialog>

        <!-- 删除提示框 -->
        <el-dialog title="提示" :visible.sync="delVisible" width="300px" center>
            <div class="del-dialog-cnt">删除不可恢复，是否确定删除？</div>
            <span slot="footer" class="dialog-footer">
                <el-button @click="delVisible = false">取 消</el-button>
                <el-button type="primary" @click="deleteRow">确 定</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        name: 'basetable',
        inject:['reload'],
        data() {
            return {
                tableData: [],
                cur_page: 1,
                multipleSelection: [],
                select_cate: '',
                select_word: '',
                del_list: [],
                is_search: false,
                editVisible: false,
                delVisible: false,
                form: {
                    dName: '',
                    dNum: '',
                    dDept:'',
                    dSex:'',
                    dLevel:'',
                    dEmail:'',
                    dept:'',
                    dTel: '',
                    doctorlv:''
                },
                idx: -1
            }
        },
        created() {
            this.getData();
        },
        computed: {
            data() {
                return this.tableData.filter((d) => {
                    let is_del = false;
                    for (let i = 0; i < this.del_list.length; i++) {
                        if (d.dName === this.del_list[i].dName) {
                            is_del = true;
                            break;
                        }
                    }
                    if (!is_del) {
                        if (d.dName.indexOf(this.select_cate) > -1 &&
                            (d.dName.indexOf(this.select_word) > -1 ||
                                d.dNum.indexOf(this.select_word) > -1)
                        ) {
                            return d;
                        }
                    }
                })
            }
        },
        methods: {
            // 分页导航
            handleCurrentChange(val) {
                this.cur_page = val;
                this.getData();
            },
            // 获取 后台 数据
            getData() {
                this.$axios.get('/doctor/selectAll',{

                }).then((res) => {
                    this.tableData = res.data.data;
                })
            },
            search() {
                this.$axios.get('/doctor/selectByName',{
                    params:{
                        dName:this.select_word
                    }
                }).then((res) => {
                    this.tableData = res.data.data;
                    this.reload();
                })
            },
            formatter(row, column) {
                return row.dTel;
            },
            filterTag(value, row) {
                return row.tag === value;
            },
            handleEdit(index, row) {
                this.idx = index;
                alert(this.tableData.doctorlv);
                const item = this.tableData[index];
                this.form = {
                    dId: item.dId,
                    dName: item.dName,
                    dNum: item.dNum,
                    dTel: item.dTel,
                    dDept:item.dept,
                    deId:item.dept.deId,
                    dSex:item.dSex,
                    dLevel:item.dLevel,
                    dEmail:item.dEmail,
                    doctorlv:item.doctorlv
                }
                this.editVisible = true;
            },
            handleDelete(index, row) {
                this.idx = index;
                this.dId = row.dId;
                this.delVisible = true;
            },
            delAll() {
                const length = this.multipleSelection.length;
                let str = '';
                this.del_list = this.del_list.concat(this.multipleSelection);
                for (let i = 0; i < length; i++) {
                    str += this.multipleSelection[i].dName + ' ';
                }
                this.$message.error('删除了' + str);
                this.multipleSelection = [];
            },
            handleSelectionChange(val) {
                this.multipleSelection = val;
            },
            // 保存编辑
            saveEdit() {
                this.$axios.get('/doctor/update',{
                    params: {
                        dId:this.form.dId,
                        dName: this.form.dName,
                        dNum: this.form.dNum,
                        dTel: this.form.dTel,
                        dSex:this.form.dSex,
                        dDept:this.form.deId,
                        dEmail:this.form.dEmail,
                        dLevel:this.form.dLevel
                    }
                }).then((response) =>{
                    this.editVisible = false;
                    this.reload();
                    this.$message.success(`修改第 ${this.idx+1} 行成功`);
                }
            )},
            // 确定删除
            deleteRow() {
                this.$axios.get('/doctor/delete', {
                    params: {
                        dId: this.dId
                    }
                }).then((response) => {
                    this.reload();
                    this.$message.success('删除成功');
                    this.delVisible = false;
                })
            }
        }
    }

</script>

<style scoped>
    .handle-box {
        margin-bottom: 20px;
    }

    .handle-select {
        width: 120px;
    }

    .handle-input {
        width: 300px;
        display: inline-block;
    }
    .del-dialog-cnt{
        font-size: 16px;
        text-align: center
    }
    .table{
        width: 100%;
        font-size: 14px;
    }
    .red{
        color: #ff0000;
    }
</style>
