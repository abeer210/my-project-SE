package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import vigqyno.C0201;

public final class z8 extends SSLSocket {
    private final SSLSocket a;

    public z8(x8 x8Var, SSLSocket sSLSocket) {
        this.a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) throws IOException {
        this.a.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.a.close();
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        this.a.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.a.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() throws IOException {
        return this.a.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() throws SocketException {
        return this.a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.a.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() throws SocketException {
        return this.a.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() throws IOException {
        return this.a.getOutputStream();
    }

    public final int getPort() {
        return this.a.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.a.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() throws SocketException {
        return this.a.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() throws SocketException {
        return this.a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.a.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() throws SocketException {
        return this.a.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() throws SocketException {
        return this.a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.a.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() throws SocketException {
        return this.a.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() throws SocketException {
        return this.a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.a.isBound();
    }

    public final boolean isClosed() {
        return this.a.isClosed();
    }

    public final boolean isConnected() {
        return this.a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws IOException {
        this.a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            List asList = Arrays.asList(strArr);
            String r1 = C0201.m82(21957);
            if (asList.contains(r1)) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove(r1);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
        this.a.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws SocketException {
        this.a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.a.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
        this.a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.a.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.a.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws SocketException {
        this.a.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.a.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.a.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.a.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.a.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) throws SocketException {
        this.a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.a.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws IOException {
        this.a.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws IOException {
        this.a.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws IOException {
        this.a.startHandshake();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.a.connect(socketAddress, i);
    }
}
