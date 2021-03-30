package guy.maxim

import guy.maxim.singlefactory.{BigDataLaptopClient, ModularSectorLaptopFactory}

object App {
  def main(args: Array[String]) : Unit = {
    val maxim = new BigDataLaptopClient(ModularSectorLaptopFactory)
    maxim.useLaptop()
  }
}
