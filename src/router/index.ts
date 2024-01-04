import { createRouter, createWebHashHistory, RouteRecordRaw } from 'vue-router'
import LoginView from '@/views/LoginView.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: () => import(/* webpackChunkName: "about" */ '@/views/LoginView.vue')
  },
  {
    path: '/user',
    name: 'user',
    component: () => import(/* webpackChunkName: "about" */ '@/views/UsertodosView.vue')
  },
  {
    path: '/admin',
    name: 'admin',
    component: () => import(/* webpackChunkName: "about" */ '@/views/AdminView.vue')
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
