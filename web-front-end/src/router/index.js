import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Index from '@/components/Index'
Vue.use(Router)

export const constantRouterMap=[
  {
    path: '/',
    name: 'Login',
    component: Login
  },
  {
    path:"/index",
    name:"Index",
    component:Index
  }
]

export default new Router({
  routes:constantRouterMap
})
/*export const asyncRouterMap=[
  {
    path: "/admin",
    meta: {
      roles: ["admin"]
    },
    component: ()=>import("@/components/admin"),
  },
  {
    path: "/user",
    meta: {
      roles: ["user"]
    },
    component: ()=>import("@/component/user")
  },
  {
    path: "*",
    redirect: "/404",
    hidden: true
  }
]*/
