package com.hootsuite.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;

@SuppressWarnings("Unused")
public class SampleLambda {

    public static String invokeFunction(int request, @SuppressWarnings("unused") Context context) {
         return (request == 0) ? "ZERO" : "GREATER THAN ZERO";
        // TODO STEP 10 Comment out the line above and uncomment the lines below
//        switch (request) {
//            case 0: return "ZERO";
//            case 2: return "TWO";
//            case 3: return "THREE";
//            default: return "GREATER THAN ZERO";
//        }

        // TODO Comment out the lines above and uncomment the lines below
//        switch (request) {
//            case 0: return "ZERO";
//            case 2: return "TWO";
//            case 3: return "THREE";
//            case 4: return "FOUR";
//            default: return "GREATER THAN ZERO";
//        }
    }
}