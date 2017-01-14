package com.jedlab.pm.controller;

import java.util.Collection;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;

import com.jedlab.pm.model.User;

public final class AuthenticationUtil
{

  

    public static String getUsername()
    {
        if (SecurityContextHolder.getContext() == null)
        {
            return null;
        }
        if (SecurityContextHolder.getContext().getAuthentication() == null)
        {
            return null;
        }
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    public static boolean isAuthenticated()
    {
        if (SecurityContextHolder.getContext() == null || SecurityContextHolder.getContext().getAuthentication() == null)
        {
            return false;
        }
        return true;
    }

    public static boolean isLoggedIn()
    {
        if (isAuthenticated())
            return SecurityContextHolder.getContext().getAuthentication().isAuthenticated();
        else
            return false;

    }

    public static Authentication getAuthentication()
    {
        if (SecurityContextHolder.getContext() == null)
        {
            return null;
        }
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static Long getUserId()
    {
        if (isLoggedIn())
        {
            Authentication auth = getAuthentication();
            return ((User) auth.getPrincipal()).getId();
        }
        return null;
    }

    public static User getSecurityUser()
    {
        if (isLoggedIn())
        {
            Authentication auth = getAuthentication();
            return (User) auth.getPrincipal();
        }
        return null;
    }

   
    
}

