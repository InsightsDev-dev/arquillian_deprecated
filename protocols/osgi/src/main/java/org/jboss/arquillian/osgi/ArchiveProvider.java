/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.osgi;

import javax.management.ObjectName;

import org.jboss.shrinkwrap.api.spec.JavaArchive;


/**
 * A test class may contain a static inner class that implements this interface, which 
 * can then be used to generate test archives dynamically during test method execution.
 * 
 * The framework makes a callback to the client side test runner to generate the archive.
 *
 * @author thomas.diesler@jboss.com
 * @since 06-Sep-2010
 */
public interface ArchiveProvider
{
   ObjectName getObjectName();
   
   JavaArchive getTestArchive(String name);
}
