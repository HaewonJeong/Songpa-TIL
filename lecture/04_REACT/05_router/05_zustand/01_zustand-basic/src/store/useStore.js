import { create } from "zustand";

export const useStore = create( 
    (set) => (
    {
        count : 0,
        text: "",
        increase: () => set((state) => ({count: state.count + 1})),
        decrease: () => set((state) => ({count: state.count - 1})),
        //state 데이터의 스냅샷
        setText: (value) => set({text : value}),
    })
);


// // 1. 화살표 대신 function(set)을 쓰고, 객체를 return 합니다.
// export const useStore = create(function(set) {
//     return {
//         count: 0,
//         text: "",
//         // 2. increase 함수도 function()으로 정직하게 씁니다.
//         increase: function() {
//             // set 안에도 function(state)를 넣어서 return 시킵니다.
//             set(function(state) {
//                 return { count: state.count + 1 };
//             });
//         },

//         // 3. decrease 함수
//         decrease: function() {
//             set(function(state) {
//                 return { count: state.count - 1 };
//             });
//         },

//         // 4. setText 함수 (여긴 state가 필요 없으니 바로 객체를 넣습니다)
//         setText: function(value) {
//             set({ text: value });
//         }
//     };
    
// });