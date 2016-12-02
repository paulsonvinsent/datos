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
package com.datos.vfs.operations;

import com.datos.vfs.FileSystemException;

/**
 * FileOperations interface provides API to work with operations.
 *
 * @see FileOperation on what a operation in the context of VFS is.
 *
 * @since 0.1
 */
public interface FileOperations
{
    /**
     * @return all operations associated with the fileObject
     * @throws FileSystemException if an error occurs.
     */
    Class<? extends FileOperation>[] getOperations() throws FileSystemException;

    /**
     * @param operationClass the operation Class.
     * @return a operation implementing the given {@code operationClass}
     * @throws FileSystemException if an error occus.
     */
    FileOperation getOperation(Class<? extends FileOperation> operationClass) throws FileSystemException;

    /**
     * @param operationClass the operation Class.
     * @return if a operation {@code operationClass} is available
     * @throws FileSystemException if an error ocurs.
     */
    boolean hasOperation(Class<? extends FileOperation> operationClass) throws FileSystemException;
}
