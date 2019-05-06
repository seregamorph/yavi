/*
 * Copyright (C) 2018-2019 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.ik.yavi.fn

import org.assertj.core.api.Assertions
import org.junit.Test

class EitherExtensionsTest {
    @Test
    fun leftOrNullExists() {
        val either = Either.left<Int, String>(1)
        Assertions.assertThat(either.leftOrNull()).isEqualTo(1)
    }

    @Test
    fun leftOrNullNotExists() {
        val either = Either.right<Int, String>("foo")
        Assertions.assertThat(either.leftOrNull()).isNull()
    }

    @Test
    fun rightOrNullExists() {
        val either = Either.right<Int, String>("foo")
        Assertions.assertThat(either.rightOrNull()).isEqualTo("foo")
    }

    @Test
    fun rightOrNullNotExists() {
        val either = Either.left<Int, String>(1)
        Assertions.assertThat(either.rightOrNull()).isNull()
    }
}