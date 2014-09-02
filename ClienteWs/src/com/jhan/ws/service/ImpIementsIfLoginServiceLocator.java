/**
 * ImpIementsIfLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jhan.ws.service;

public class ImpIementsIfLoginServiceLocator extends org.apache.axis.client.Service implements com.jhan.ws.service.ImpIementsIfLoginService {

    public ImpIementsIfLoginServiceLocator() {
    }


    public ImpIementsIfLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImpIementsIfLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImpIementsIfLogin
    private java.lang.String ImpIementsIfLogin_address = "http://localhost:8181/ServiciosWeb/services/ImpIementsIfLogin";

    public java.lang.String getImpIementsIfLoginAddress() {
        return ImpIementsIfLogin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImpIementsIfLoginWSDDServiceName = "ImpIementsIfLogin";

    public java.lang.String getImpIementsIfLoginWSDDServiceName() {
        return ImpIementsIfLoginWSDDServiceName;
    }

    public void setImpIementsIfLoginWSDDServiceName(java.lang.String name) {
        ImpIementsIfLoginWSDDServiceName = name;
    }

    public com.jhan.ws.service.ImpIementsIfLogin getImpIementsIfLogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImpIementsIfLogin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImpIementsIfLogin(endpoint);
    }

    public com.jhan.ws.service.ImpIementsIfLogin getImpIementsIfLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jhan.ws.service.ImpIementsIfLoginSoapBindingStub _stub = new com.jhan.ws.service.ImpIementsIfLoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getImpIementsIfLoginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImpIementsIfLoginEndpointAddress(java.lang.String address) {
        ImpIementsIfLogin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jhan.ws.service.ImpIementsIfLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jhan.ws.service.ImpIementsIfLoginSoapBindingStub _stub = new com.jhan.ws.service.ImpIementsIfLoginSoapBindingStub(new java.net.URL(ImpIementsIfLogin_address), this);
                _stub.setPortName(getImpIementsIfLoginWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImpIementsIfLogin".equals(inputPortName)) {
            return getImpIementsIfLogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.jhan.com", "ImpIementsIfLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.jhan.com", "ImpIementsIfLogin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImpIementsIfLogin".equals(portName)) {
            setImpIementsIfLoginEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
