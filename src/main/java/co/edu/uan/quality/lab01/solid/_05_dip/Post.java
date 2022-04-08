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

/**
 * Post.
 *
 * @author dpoveda47@uan.edu.co
 * @author jogarcia05@uan.edu.co
 * @author jsiabato99@uan.edu.co
 * @author luruiz22@uan.edu.co
 * @version 1.0
 * @since 11
 */
public class Post {

    private Integer userId;
    private Integer id;
    private Boolean completed;
    private String title;

    /**
     * Empty constructor.
     */
    public Post() {
    }

    /**
     * Constructor.
     *
     * @param userId    the user id.
     * @param id        the id.
     * @param completed the flag that indicates if it's completed.
     * @param title     the title.
     */
    public Post(Integer userId, Integer id, Boolean completed, String title) {
        this.userId = userId;
        this.id = id;
        this.completed = completed;
        this.title = title;
    }

    /**
     * Gets the user id.
     *
     * @return the user id.
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     *
     * @param userId the user id.
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Gets the id.
     *
     * @return the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the id.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the completed flag.
     *
     * @return the completed flag.
     */
    public Boolean getCompleted() {
        return completed;
    }

    /**
     * Sets the completed flag.
     *
     * @param completed the completed flag.
     */
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /**
     * Gets the title.
     *
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title the title.
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
