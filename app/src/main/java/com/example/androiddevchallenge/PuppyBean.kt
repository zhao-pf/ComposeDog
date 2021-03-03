/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import java.io.Serializable

/**
 * @Author: 赵鹏飞
 * @Github: https://github.com/zhao-pf
 * @Date: 2021/2/26 21:38
 * @Description: TODO
 */
data class PuppyBean(
    val pic: Int= R.drawable.puppy1,
    val name: String="名字",
    val age: Int=5,
    val from: String="来自",
    val varieties: String="品种",
    val introduce: String="介绍",
): Serializable