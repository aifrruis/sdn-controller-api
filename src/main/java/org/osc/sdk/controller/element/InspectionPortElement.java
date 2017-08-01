/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.sdk.controller.element;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * This interface represents a inspection port element.
 * <p>
 * If the ingress and egress ports are the same, the same port will be returned for either of the methods.
 */
@ConsumerType
public interface InspectionPortElement extends Element {

    /**
     * @return the network element
     */
    NetworkElement getIngressPort();

    /**
     * @return the network element
     */
    NetworkElement getEgressPort();

}
