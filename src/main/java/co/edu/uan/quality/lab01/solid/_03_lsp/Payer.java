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

package co.edu.uan.quality.lab01.solid._03_lsp;

/**
 * Specialization of person, but it's still abstract, that identifies who can have an identification number, a credit
 * card, and can pay.
 *
 * @author dpoveda47@uan.edu.co
 * @author jogarcia05@uan.edu.co
 * @author jsiabato99@uan.edu.co
 * @author luruiz22@uan.edu.co
 * @version 1.0
 * @since 11
 */
public abstract class Payer extends Person {

    private final String identificationNumber;
    private final String creditCard;

    /**
     * Constructor.
     *
     * @param firstName            the first name.
     * @param lastName             the last name.
     * @param identificationNumber the identification number.
     * @param creditCard           the credit card.
     */
    protected Payer(String firstName, String lastName, String identificationNumber, String creditCard) {
        super(firstName, lastName);
        this.identificationNumber = identificationNumber;
        this.creditCard = creditCard;
    }

    /**
     * Applies a payment.
     */
    public abstract void pay();

    /**
     * Gets the identification number.
     *
     * @return the identification number.
     */
    public final String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Gets the credit card.
     *
     * @return the credit card.
     */
    public final String getCreditCard() {
        return creditCard;
    }
}
