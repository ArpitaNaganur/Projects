
import Dashboard from "views/Dashboard.jsx";
import UserProfile from "views/UserProfile.jsx";

import Maps from "views/Maps.jsx";

import Login from "./views/Login.jsx";
import Register from "./views/Register.jsx";
import Payment from "./views/payment"

const dashboardRoutes = [
  {
    path: "/dashboard",
    name: "Request Dashboard(for tenants)",
    icon: "pe-7s-graph",
    component: Dashboard,
    layout: "/admin"
  },
  {
    path: "/user",
    name: "User Profile(user & admin)",
    icon: "pe-7s-user",
    component: UserProfile,
    layout: "/admin"
  },

  {
    path: "/maps",
    name: "Maps",
    icon: "pe-7s-map-marker",
    component: Maps,
    layout: "/admin"
  },

  {
    login: true,
    path: "/login",
    name: "Login",
    icon: "pe-7s-smile",
    component: Login,
    layout: "/admin"
  },
  {
    register: true,
    path: "/register",
    name: "Register",
    icon: "pe-7s-smile",
    component: Register,
    layout: "/admin"
  },
  {
    path: "/payment",
    name: "Payment(for tenants)",
    icon: "pe-7s-science",
    component: Payment,
    layout: "/admin"
  }
];

export default dashboardRoutes;
