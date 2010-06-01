#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 *
 * Copyright (C) 2010 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
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
 * ====================================================================
 */
package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.jclouds.http.filters.BasicAuthentication;
import org.jclouds.rest.annotations.Endpoint;
import org.jclouds.rest.annotations.ExceptionParser;
import org.jclouds.rest.annotations.RequestFilters;
import org.jclouds.rest.functions.ReturnNullOnNotFoundOr404;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * Provides asynchronous access to ${providerName} via their REST API.
 * <p/>
 *
 * @see ${providerName}Client
 * @see <a href="TODO: insert URL of provider documentation" />
 * @author ${author}
 */
@Endpoint(${providerName}.class)
@RequestFilters(BasicAuthentication.class)
public interface ${providerName}AsyncClient {
   /*
    * TODO: define interface methods for ${providerName} 
    */
   
   /**
    * @see ${providerName}AsyncClient#list()
    */
   @GET
   @Path("/item")
   ListenableFuture<String> list();
   
   /**
    * @see ${providerName}AsyncClient#get(String)
    */
   @GET
   @ExceptionParser(ReturnNullOnNotFoundOr404.class)
   @Path("/item/{itemId}")
   ListenableFuture<String> get(@PathParam("itemId") long id);
   
}