package vn.gomimall.apps.ui.main.live;

import vn.gomimall.apps.event.BaseEvent;

/**
 * Created by KHOI LE on 5/19/2020.
 */
class LiveEvent<T> extends BaseEvent<T> {
    static final int LOGIN_FAILS = 0;

    LiveEvent(int code, String message) {
        super(code, message);
    }

    LiveEvent(int code) {
        super(code);
    }
}
