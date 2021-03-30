package guy.maxim.singlefactory

import guy.maxim.bridge.Laptop

class BigDataLaptopClient(factory: LaptopFactory) {

  val withComputer: Laptop = factory.createPersonalLaptop

  def useLaptop() : Unit = {
    withComputer.operationA(5,6)
    withComputer.operationB(66,128)
  }
}
