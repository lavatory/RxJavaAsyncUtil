/**
 * Copyright 2015 Netflix, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rx.util.async.functions;

import rx.functions.Function;

/**
 * Represents a function with four arguments that can throw an exception.
 */
public interface ThrowingFunc4<T1, T2, T3, T4, R> extends Function {
    R call(T1 t1, T2 t2, T3 t3, T4 t4) throws Exception;
}
