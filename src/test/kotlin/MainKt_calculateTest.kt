import org.junit.Test

import org.junit.Assert.*

class MainKt_calculateTest {

    @Test
    fun calculateComission_if_VK_PAY_result_0() {
        val transfer = 100_000
        val cardTypeVk = CardType.VK_PAY
        val transferAmount = 0

        val result = calculateComission(transfer, cardTypeVk, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun calculateComission_if_MIR_result_min() {
        val transfer = 1
        val cardTypeMir = CardType.MIR
        val transferAmount = 0

        val result = calculateComission(transfer, cardTypeMir, transferAmount)

        assertEquals(3500, result)
    }

    @Test
    fun calculateComission_if_MIR_result_max() {
        val transfer = 466_800
        val cardTypeMir = CardType.MIR
        val transferAmount = 0

        val result = calculateComission(transfer, cardTypeMir, transferAmount)

        assertEquals(3501, result)
    }

    @Test
    fun calculateComission_if_VISA_result_min() {
        val transfer = 1
        val cardTypeMir = CardType.VISA
        val transferAmount = 0

        val result = calculateComission(transfer, cardTypeMir, transferAmount)

        assertEquals(3500, result)
    }

    @Test
    fun calculateComission_if_VISA_result_max() {
        val transfer = 466_800
        val cardTypeMir = CardType.VISA
        val transferAmount = 0

        val result = calculateComission(transfer, cardTypeMir, transferAmount)

        assertEquals(3501, result)
    }

    @Test
    fun calculateComission_if_MASTERCARD_min_promotion_result_0() {
        val transfer = 15_000
        val cardTypeMir = CardType.MASTERCARD
        val transferAmount = 15_000
        val result = calculateComission(transfer, cardTypeMir, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun calculateComission_if_MASTERCARD_max_NOPromotion() {
        val promotionMax = 7_500_000
        val transfer = promotionMax / 2 //3_750_000
        val cardTypeMastercard = CardType.MASTERCARD
        val transferAmount = (promotionMax / 2) + 1
        val result = calculateComission(transfer, cardTypeMastercard, transferAmount)

        assertEquals(24_500, result)
    }

    @Test
    fun calculateComission_if_MASTERCARD_min_NOPromotion() {
        val promotionMin = 30_000
        val transfer = promotionMin / 2 //15_000
        val cardTypeMastercard = CardType.MASTERCARD
        val transferAmount = (promotionMin / 2) - 1
        val result = calculateComission(transfer, cardTypeMastercard, transferAmount)

        assertEquals(2090, result)
    }

    @Test
    fun calculateComission_if_MASTERCARD_max_promotion() {
        val promotionMax = 7_500_000
        val transfer = promotionMax / 2 //3_750_000
        val cardTypeMastercard = CardType.MASTERCARD
        val transferAmount = promotionMax / 2
        val result = calculateComission(transfer, cardTypeMastercard, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun calculateComission_if_MASTERCARD_min_promotion() {
        val promotionMin = 30_000
        val transfer = promotionMin / 2 //15_000
        val cardTypeMastercard = CardType.MASTERCARD
        val transferAmount = promotionMin / 2
        val result = calculateComission(transfer, cardTypeMastercard, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun calculateComission_if_MAESTRO_max_NOPromotion() {
        val promotionMax = 7_500_000
        val transfer = promotionMax / 2 //3_750_000
        val cardTypeMaestro = CardType.MAESTRO
        val transferAmount = (promotionMax / 2) + 1
        val result = calculateComission(transfer, cardTypeMaestro, transferAmount)

        assertEquals(24_500, result)
    }

    @Test
    fun calculateComission_if_MAESTRO_min_NOPromotion() {
        val promotionMin = 30_000
        val transfer = promotionMin / 2 //15_000
        val cardTypeMaestro = CardType.MAESTRO
        val transferAmount = (promotionMin / 2) - 1
        val result = calculateComission(transfer, cardTypeMaestro, transferAmount)

        assertEquals(2090, result)
    }

    @Test
    fun calculateComission_if_MAESTRO_max_promotion() {
        val promotionMax = 7_500_000
        val transfer = promotionMax / 2 //3_750_000
        val cardTypeMaestro = CardType.MAESTRO
        val transferAmount = promotionMax / 2
        val result = calculateComission(transfer, cardTypeMaestro, transferAmount)

        assertEquals(0, result)
    }

    @Test
    fun calculateComission_if_MAESTRO_min_promotion() {
        val promotionMin = 30_000
        val transfer = promotionMin / 2 //15_000
        val cardTypeMaestro = CardType.MAESTRO
        val transferAmount = promotionMin / 2
        val result = calculateComission(transfer, cardTypeMaestro, transferAmount)

        assertEquals(0, result)
    }
}