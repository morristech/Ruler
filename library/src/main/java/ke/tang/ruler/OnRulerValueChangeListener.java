/*
 * Copyright (C) 2018 TangKe
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
 */
package ke.tang.ruler;

/**
 * 当标尺的值变化时的回调接口
 */
public interface OnRulerValueChangeListener {
    /**
     * 标尺值变化回调
     *
     * @param value        当前标尺的值
     * @param displayValue 当前标尺显示的值（格式化后）
     * @see RulerValueFormatter
     */
    void onRulerValueChanged(int value, String displayValue);
}