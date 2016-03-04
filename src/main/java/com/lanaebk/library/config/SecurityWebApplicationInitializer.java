package com.lanaebk.library.config;

import org.springframework.security.web.context.*;

/**
 * Created by Lanae on 3/3/2016.
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer
{
    public SecurityWebApplicationInitializer()
    {
        super(SecurityConfig.class);
    }
}
