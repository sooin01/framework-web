package com.my.app.daemon;

import org.apache.commons.daemon.Daemon;
import org.apache.commons.daemon.DaemonContext;
import org.apache.commons.daemon.DaemonInitException;

public class ADaemon implements Daemon {

	@Override
	public void destroy() {
		System.out.println(Thread.currentThread().getStackTrace()[0]);
	}

	@Override
	public void init(DaemonContext arg0) throws DaemonInitException, Exception {
		System.out.println(Thread.currentThread().getStackTrace()[0]);
	}

	@Override
	public void start() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[0]);
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[0]);
	}

}
