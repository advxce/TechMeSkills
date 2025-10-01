package Homework_8

class Electronics(override val productName:String,val cost:Double, val discount: Int):Product {
    override fun getFinalPrice(): Double {
        return cost - (cost/100 * discount)
    }
}