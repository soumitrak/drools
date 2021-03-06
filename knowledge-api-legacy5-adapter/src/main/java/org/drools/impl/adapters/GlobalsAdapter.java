/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.impl.adapters;

import org.kie.api.runtime.Globals;

public class GlobalsAdapter implements org.drools.runtime.Globals {

    private final Globals delegate;

    public GlobalsAdapter(Globals delegate) {
        this.delegate = delegate;
    }

    public Object get(String identifier) {
        return delegate.get(identifier);
    }

    public void set(String identifier, Object value) {
        delegate.set(identifier, value);
    }

    public void setDelegate(org.drools.runtime.Globals delegate) {
        this.delegate.setDelegate(((GlobalsAdapter)delegate).delegate);
    }

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof GlobalsAdapter && delegate.equals(((GlobalsAdapter)obj).delegate);
    }
}
