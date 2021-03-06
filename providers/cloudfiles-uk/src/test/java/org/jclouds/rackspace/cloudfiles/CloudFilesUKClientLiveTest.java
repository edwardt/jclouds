/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.rackspace.cloudfiles;

import static org.testng.Assert.assertEquals;

import org.jclouds.cloudfiles.CloudFilesClient;
import org.jclouds.openstack.swift.CommonSwiftClientLiveTest;
import org.jclouds.openstack.swift.domain.SwiftObject;
import org.testng.annotations.Test;

/**
 * Tests behavior of {@code CloudFilesClient}
 * 
 * @author Adrian Cole
 */
@Test(groups = "live", singleThreaded = true, testName = "CloudFilesUKClientLiveTest")
public class CloudFilesUKClientLiveTest extends CommonSwiftClientLiveTest<CloudFilesClient> {
   // NOTE cloudfilesuk doesn't have cdn

   @Override
   public CloudFilesClient getApi() {
      return (CloudFilesClient) context.getProviderSpecificContext().getApi();
   }
   
   @Override
   protected void testGetObjectContentType(SwiftObject getBlob) {
      //lovely new bug.. should be text/plain
      assertEquals(getBlob.getInfo().getContentType(), "application/x-www-form-urlencoded");
   }

}
