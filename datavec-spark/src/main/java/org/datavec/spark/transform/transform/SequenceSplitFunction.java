/*
 *  * Copyright 2016 Skymind, Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 */

package org.datavec.spark.transform.transform;

import lombok.AllArgsConstructor;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.datavec.api.writable.Writable;
import org.datavec.api.transform.sequence.SequenceSplit;

import java.util.List;

/**
 * Created by Alex on 17/03/2016.
 */
@AllArgsConstructor
public class SequenceSplitFunction implements FlatMapFunction<List<List<Writable>>,List<List<Writable>>>{

    private final SequenceSplit split;

    @Override
    public Iterable<List<List<Writable>>> call(List<List<Writable>> collections) throws Exception {
        return split.split(collections);
    }
}
