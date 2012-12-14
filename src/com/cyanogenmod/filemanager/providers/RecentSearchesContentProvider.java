/*
 * Copyright (C) 2012 The CyanogenMod Project
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

package com.cyanogenmod.filemanager.providers;

import android.content.SearchRecentSuggestionsProvider;

/**
 * A content provider for manage the user search history.
 */
public class RecentSearchesContentProvider extends SearchRecentSuggestionsProvider {

    /**
     * The authority string name.
     */
    public static final String AUTHORITY =
            "com.cyanogenmod.filemanager.providers.recentsearches"; //$NON-NLS-1$

    /**
     * The provider mode.
     */
    public static final int MODE = DATABASE_MODE_QUERIES;

    /**
     * Constructor of <code>RecentSearchesContentProvider</code>.
     */
    public RecentSearchesContentProvider() {
        super();
        setupSuggestions(AUTHORITY, MODE);
    }
}
