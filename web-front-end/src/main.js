// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import store from './store/index'
import "./assets/iconfont/iconfont.css"
Vue.use(VueAxios, axios)

import App from './App'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import router from './router'

Vue.use(VueAxios, axios)


Vue.use(ElementUI);
Vue.config.productionTip = false;
/*Vue.prototype.$ajax=axios*/


/*axios配置*/
axios.defaults.timeout=5000;
axios.defaults.headers.post["Content-Type"]="application/json;charset=UTF-8"
axios.defaults.baseURL="/api"

/*axios.interceptors.request.use(function (config) {
  let token=localStorage.getItem("Authentication");
  if (token)
  {
    config.headers.token="${token}";
  }
  return config;
},
  error => {
  return Promise.reject(error)
  })*/

/* eslint-disable no-new */
new Vue({
  el: '#app',
  store,
  router,
  components: { App },
  template: '<App/>'
})
