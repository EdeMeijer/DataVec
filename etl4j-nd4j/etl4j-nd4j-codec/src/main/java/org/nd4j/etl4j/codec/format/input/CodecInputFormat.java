/*
 *
 *  *
 *  *  * Copyright 2015 Skymind,Inc.
 *  *  *
 *  *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *    you may not use this file except in compliance with the License.
 *  *  *    You may obtain a copy of the License at
 *  *  *
 *  *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  *    Unless required by applicable law or agreed to in writing, software
 *  *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *    See the License for the specific language governing permissions and
 *  *  *    limitations under the License.
 *  *
 *
 */

package org.nd4j.etl4j.codec.format.input;

import org.nd4j.etl4j.api.conf.Configuration;
import org.nd4j.etl4j.api.formats.input.BaseInputFormat;
import org.nd4j.etl4j.api.records.reader.RecordReader;
import org.nd4j.etl4j.api.split.InputSplit;
import org.nd4j.etl4j.codec.reader.CodecRecordReader;

import java.io.IOException;

/**
 * @author Adam Gibson
 */
public class CodecInputFormat extends BaseInputFormat {
    @Override
    public RecordReader createReader(InputSplit split, Configuration conf) throws IOException, InterruptedException {
        RecordReader reader = new CodecRecordReader();
        reader.initialize(conf, split);
        return reader;
    }
}