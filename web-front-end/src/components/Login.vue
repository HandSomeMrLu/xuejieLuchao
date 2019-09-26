<template>

  <div id="login_app">
    <img src="/static/img/login_bg1.jpg" class="login_bg"/>
    <div class="login_form_bg">
      <p class="login_title">用户登陆</p>
    <el-form ref="form" :modle="userForm" label-width="100px" class="login_form">

      <el-form-item label="账号:" class="user_name_label">
        <el-input v-model="userForm.username" clearable ></el-input>

      </el-form-item>
      <el-form-item label="密码:" class="user_name_label">
        <el-input v-model="userForm.password"  show-password></el-input>
      </el-form-item>

    </el-form>
      <!--<div class="login_input_bg">
      <p class="user_name_p">用户名:</p>
      <el-input placeholde="请输入用户名:" v-model="userForm.username"></el-input>
      </div>
       <el-input show-password v-model="userForm.password"></el-input>
    </div>-->
      <div class="login_function_bg">
      <el-link type="primary" class="right_a">忘记密码?</el-link>
      </div>
      <el-button @click="submitUser" type="primary" class="login_btn">登&nbsp录</el-button>
  </div>
  </div>
</template>

<script>
    export default {
        name: "Login",
      data()
      {
        return {
          userForm: {
            username: 'zhangs',
            password: ""
          }
        }
      },
      methods: {
      submitUser: function (event) {
       const FKUser =JSON.stringify({
         username: this.userForm.username,
         password: this.userForm.password
       });

      /* this.axios.post("/login",FKUser).then((response)=> {
         //成功之后处理逻辑
         alert(JSON.stringify(response))
         const authorization=response.headers.authorization;
         localStorage.setItem("Authorization",authorization);
        // alert(authorization);
         this.$router.push("/login");
       })
         .catch((error)=>
         {
           alert("失败");
           console.log(error);
         })*/
      this.$router.push("/index");
      }
    }
    }

</script>

<style >
#login_app
{
width: 100%;
  height: 100%;
  overflow: hidden;
}
.login_bg
{

  width: 100%;
  height: 100%;
  position: absolute;
  z-index: -2;
}

.login_form_bg
{
    border: 1px solid whitesmoke;
    margin: 250px auto;
    width: 400px;
    height: 400px;
}
.login_title
{
  width: 100%;
  text-align: center;
  color: whitesmoke;
  font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "微软雅黑", Arial, sans-serif;
  font-size: 20px;
}
.login_form
{
  margin-top: 40px;
}
.user_name_p
{
  float: left;

}
#login_app .el-form-item
{
width: 80%;

}
#login_app .el-input__inner
{
  height: 30px;
}
.login_form .el-form-item__label
{
  color: whitesmoke;
  font-size: 16px;
}
.login_btn
{
  width: 60%;
  margin-top: 20px;
  margin-left: 20%;
}
.right_a
{
  float: right;
}
.login_function_bg
{
  width: 60%;
  margin-left: 20%;
}
</style>
