/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.k.loader.yaml.support;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.camel.k.annotation.yaml.YAMLMixIn;

@YAMLMixIn(org.apache.camel.model.dataformat.Any23DataFormat.class)
public abstract class Any23DataFormatMixIn {
    @JsonIgnore
    public abstract void setConfiguration(Map<String, String> configuration);
}
