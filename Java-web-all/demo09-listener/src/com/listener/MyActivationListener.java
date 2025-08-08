package com.listener;

import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionEvent;

public class MyActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {

    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {

    }
}
