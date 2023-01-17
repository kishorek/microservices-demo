package com.msdemo.services;

import com.msdemo.rideservice.grpc.RideSearchRequest;
import com.msdemo.rideservice.grpc.RideSearchResponse;
import com.msdemo.rideservice.grpc.RideServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class RideService extends RideServiceGrpc.RideServiceImplBase {
    @Override
    public void findRides(RideSearchRequest request, StreamObserver<RideSearchResponse> responseObserver) {
        super.findRides(request, responseObserver);
    }
}
