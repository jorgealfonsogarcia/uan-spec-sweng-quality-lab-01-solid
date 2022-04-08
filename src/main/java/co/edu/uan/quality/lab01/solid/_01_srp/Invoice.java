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

package co.edu.uan.quality.lab01.solid._01_srp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Invoice. Its only responsibility is to store the drinks.
 *
 * @author dpoveda47@uan.edu.co
 * @author jogarcia05@uan.edu.co
 * @author jsiabato99@uan.edu.co
 * @author luruiz22@uan.edu.co
 * @version 1.0
 * @since 11
 */
public class Invoice {

    private final InvoiceTotalCalculator calculator = new InvoiceTotalCalculator();

    private final List<Drink> drinks;

    /**
     * Constructor.
     */
    public Invoice() {
        this(new ArrayList<>());
    }

    /**
     * Constructor.
     *
     * @param drinks the drinks to store.
     */
    public Invoice(List<Drink> drinks) {
        this.drinks = Objects.requireNonNull(drinks);
    }

    /**
     * Adds a new drink to the invoice.
     *
     * @param drink the drink.
     * @return as specified by {@link java.util.Collection#add(Object)}
     */
    public boolean add(final Drink drink) {
        return drinks.add(drink);
    }

    /**
     * Calculates the total value of the invoice.
     *
     * @return the total value.
     */
    public final double calculateTotal() {
        return calculator.calculateTotal(drinks);
    }
}
