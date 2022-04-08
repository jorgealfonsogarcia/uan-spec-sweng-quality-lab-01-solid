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

package co.edu.uan.quality.lab01.solid._04_isp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Business service for sales. It can add, get, and list sales.
 *
 * @author dpoveda47@uan.edu.co
 * @author jogarcia05@uan.edu.co
 * @author jsiabato99@uan.edu.co
 * @author luruiz22@uan.edu.co
 * @version 1.0
 * @since 11
 */
public class SaleService implements Adder<Sale>, Getter<Sale, Integer>, Lister<Sale> {

    @Override
    public void add(Sale entity) {
        System.out.println("Sale Added! = " + entity);
    }

    @Override
    public Sale get(Integer id) {
        final var sale = new Sale(0.0D, LocalDate.now());
        System.out.println("Sale Found! = " + sale);
        return sale;
    }

    @Override
    public List<Sale> getAll() {
        final var sales = new ArrayList<Sale>();
        System.out.println("All Sales Found! = " + sales);
        return sales;
    }
}
