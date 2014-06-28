/*
 * Copyright 2014 Nicolas Morel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.nmorel.gwtjackson.client.mixins;

import com.github.nmorel.gwtjackson.client.AbstractConfiguration;
import com.github.nmorel.gwtjackson.shared.mixins.MixinSerForMethodsTester.EmptyBean;
import com.github.nmorel.gwtjackson.shared.mixins.MixinSerForMethodsTester.MixInForSimple;

/**
 * Configuration class to define all the MixIn annotations used in tests
 *
 * @author Nicolas Morel.
 */
public class MixInConfiguration extends AbstractConfiguration {

    @Override
    protected void configure() {
        addMixInAnnotations( EmptyBean.class, MixInForSimple.class );
    }
}
