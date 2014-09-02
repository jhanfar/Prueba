package com.jhan.ws.service;

public class ImpIementsIfLoginProxy implements com.jhan.ws.service.ImpIementsIfLogin {
  private String _endpoint = null;
  private com.jhan.ws.service.ImpIementsIfLogin impIementsIfLogin = null;
  
  public ImpIementsIfLoginProxy() {
    _initImpIementsIfLoginProxy();
  }
  
  public ImpIementsIfLoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initImpIementsIfLoginProxy();
  }
  
  private void _initImpIementsIfLoginProxy() {
    try {
      impIementsIfLogin = (new com.jhan.ws.service.ImpIementsIfLoginServiceLocator()).getImpIementsIfLogin();
      if (impIementsIfLogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)impIementsIfLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)impIementsIfLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (impIementsIfLogin != null)
      ((javax.xml.rpc.Stub)impIementsIfLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jhan.ws.service.ImpIementsIfLogin getImpIementsIfLogin() {
    if (impIementsIfLogin == null)
      _initImpIementsIfLoginProxy();
    return impIementsIfLogin;
  }
  
  public com.jhan.ws.beans.LoginWebSer validateLogin(com.jhan.ws.beans.LoginWebSer obj) throws java.rmi.RemoteException{
    if (impIementsIfLogin == null)
      _initImpIementsIfLoginProxy();
    return impIementsIfLogin.validateLogin(obj);
  }
  
  
}