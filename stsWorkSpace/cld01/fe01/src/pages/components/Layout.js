import React from "react";
import { NavLink, Outlet } from "react-router";

export default function Layout({login}){
    return(
        <>
            <nav>
                <NavLink to={'/'}>home</NavLink>{" "}
                <NavLink to={'/intro'}>intro</NavLink>{" "}
                <NavLink to={'/dept'}>dept</NavLink>{" "}
                {login.result?
                <NavLink to={'/logout'}>logout</NavLink>:
                <NavLink to={'/login'}>login</NavLink>
                }
            </nav>
            <>
                <Outlet/>
            </>
        </>
    )
}