(module
  (func $main (result i32)
   (local i32)
   (local i32)
　　　....　　　　　　　　　　　　// local が 26 個並ぶ
   (local i32)
   i32.const 1
   i32.const 2
   i32.add
   local.tee 0
   drop
   i32.const 6
   i32.const 2
   i32.sub
   local.tee 1
   drop
   local.get 0
   local.get 1
   i32.mul
  )
  (export "main" (func $main))
)