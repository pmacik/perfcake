/*
 * -----------------------------------------------------------------------\
 * PerfCake
 *  
 * Copyright (C) 2010 - 2013 the original author or authors.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -----------------------------------------------------------------------/
 */
package org.perfcake.message.sequences;

import org.perfcake.PerfCakeException;

/**
 * Every single line in a given input file specifies a value of this sequence.
 * Once the end of the file is hit, the sequence starts from beginning.
 * The whole file is read in the memory, so make sure the file is of a reasonable size
 * given your expectations and memory limits.
 *
 * @author Martin Večeřa <marvenec@gmail.com>
 */
public class FileLinesSequence implements Sequence {

   /**
    * The location of the file to read ro
    */
   private String fileUrl;

   @Override
   public String getNext() {
      return null;
   }

   @Override
   public void reset() throws PerfCakeException {

   }
}
