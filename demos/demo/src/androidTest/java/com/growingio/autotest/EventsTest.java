/*
 * Copyright (C) 2020 Beijing Yishu Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.growingio.autotest;

import com.growingio.autotest.help.MockEventsApiServer;

import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class EventsTest {
    private final MockEventsApiServer mEventsApiServer = new MockEventsApiServer();

    protected MockEventsApiServer getEventsApiServer() {
        return mEventsApiServer;
    }

    @Before
    public void setUp() throws IOException {
        mEventsApiServer.start();
    }

    @After
    public void teardown() throws IOException {
        mEventsApiServer.shutdown();
    }
}
