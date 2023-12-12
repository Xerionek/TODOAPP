/*package com.code.jsch;

import com.jcraft.jsch.*;

public class Ssh {

    private Session session;

    static class MyLogger implements com.jcraft.jsch.Logger {
        static java.util.Hashtable<Integer, String> name = new java.util.Hashtable<>();

        static {
            name.put(DEBUG, "DEBUG: ");
            name.put(INFO, "INFO: ");
            name.put(WARN, "WARN: ");
            name.put(ERROR, "ERROR: ");
            name.put(FATAL, "FATAL: ");
        }

        @Override
        public boolean isEnabled(int level) {
            return true;
        }

        @Override
        public void log(int level, String message) {
            System.err.print(name.get(level));
            System.err.println(message);
        }
    }

    public void connect() throws JSchException {
        JSch.setLogger(new MyLogger()); // Dodaj własny logger
        JSch jsch = new JSch();

        String sshHost = "57.128.194.221";
        String sshUser = "user2";
        String sshPassword = "nxSVA53vZtg#";
        int sshPort = 22;

        session = jsch.getSession(sshUser,sshHost,sshPort);

        session.setPassword(sshPassword);
        session.setConfig("StrictHostKeyChecking", "no");
        System.out.println(session.getPort());
        session.connect(10000);
        Channel channel = session.openChannel("sftp");
        channel.connect(5000);
        ChannelSftp channelSftp = (ChannelSftp) channel;


    }

    public void disconnect() {
        if (session != null && session.isConnected()) {
            session.disconnect();
        }
    }
}*/
