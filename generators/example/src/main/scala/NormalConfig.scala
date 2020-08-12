package example
import chisel3._
import freechips.rocketchip.config.{Config}
class NormalTinyBoomConfigS1W16 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(1,16) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class NormalTinyBoomConfigS2W8 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(2,8) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class NormalTinyBoomConfigS4W4 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(4,4) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class NormalTinyBoomConfigS8W2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(8,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class NormalTinyBoomConfigS16W1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(16,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class NormalTinyBoomConfigS1W32 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(1,32) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class NormalTinyBoomConfigS2W16 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(2,16) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class NormalTinyBoomConfigS4W8 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(4,8) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class NormalTinyBoomConfigS8W4 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(8,4) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class NormalTinyBoomConfigS16W2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithNormalTinyBooms(16,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

