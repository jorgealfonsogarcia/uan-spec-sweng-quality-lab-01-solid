/*
 * MIT License
 *
 * Copyright (c) 2022 Universidad Antonio Nariño
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package co.edu.uan.quality.lab01.solid._05_dip;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Gets the information of posts for one file.
 *
 * @author dpoveda47@uan.edu.co
 * @author jogarcia05@uan.edu.co
 * @author jsiabato99@uan.edu.co
 * @author luruiz22@uan.edu.co
 * @version 1.0
 * @since 11
 */
public class InfoByFile implements InfoGetter<Post> {

    private final String path;
    private final Gson gson;

    /**
     * Constructor.
     *
     * @param path the file's path to read.
     * @param gson the Gson instance.
     */
    public InfoByFile(String path, Gson gson) {
        this.path = path;
        this.gson = gson;
    }

    @Override
    public List<Post> get() {
        try (final var reader = Files.newBufferedReader(Paths.get(path))) {
            return gson.fromJson(reader, new TypeToken<List<Post>>() {
            }.getType());
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
