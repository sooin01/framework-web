package com.my.app.web.common.constant;

public class Constant {

	enum State {
		UNKNWON("10000") {
			@Override
			public String getText() {
				return "unknwon";
			}
		}, WAIT("10001") {
			@Override
			public String getText() {
				return null;
			}
		}, START("10002") {
			@Override
			public String getText() {
				return null;
			}
		}, PROCESS("10003") {
			@Override
			public String getText() {
				return null;
			}
		}, END("10004") {
			@Override
			public String getText() {
				return null;
			}
		};

		String name;

		State(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public abstract String getText();
	}

	enum Status {
		SUCCESS, FAIL
	}

}
