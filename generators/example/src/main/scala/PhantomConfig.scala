package example
import chisel3._
import freechips.rocketchip.config.{Config}
class PhantomTinyBoomConfigS1W16R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(1,16,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS2W8R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(2,8,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS2W8R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(2,8,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS4W4R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(4,4,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class PhantomTinyBoomConfigS4W4R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(4,4,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS16W1R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(16,1,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS16W1R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(16,1,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS8W2R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(8,2,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS8W2R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(8,2,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS8W2R4 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(8,2,4) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system



class PhantomTinyBoomConfigS1W32R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(1,32,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS2W16R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(2,16,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS2W16R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(2,16,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS4W8R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(4,8,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class PhantomTinyBoomConfigS4W8R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(4,8,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS8W4R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(8,4,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS8W4R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(8,4,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS16W2R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(16,2,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS16W2R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(16,2,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS32W1R1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(32,2,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class PhantomTinyBoomConfigS32W2R2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithPhantomTinyBooms(32,2,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system




