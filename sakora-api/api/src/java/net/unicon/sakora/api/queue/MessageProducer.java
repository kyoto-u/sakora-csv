/*
 * Licensed to the Sakai Foundation under one or more contributor
 * license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership.
 * The Sakai Foundation licenses this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package net.unicon.sakora.api.queue;

/**
 * A simplified interface to abstract out the details of the
 * implementation from the caller.  This interface is used
 * to place a new XML message chunk on to the persistent
 * queue, without necessarily knowing how that persistent queue
 * is implemented.
 */
public interface MessageProducer {
	
	/**
	 * Place a new XML message chunk on to the persistent queue. 
	 * @param messageText the XML message chunk
	 */
	void createMessage(String messageText);
}
