package pt.tecnico.bicloin.hub;

import pt.tecnico.bicloin.hub.grpc.HubServiceGrpc;
import pt.tecnico.bicloin.hub.grpc.Hub.*;
import io.grpc.stub.StreamObserver;
import pt.tecnico.bicloin.hub.domain.Hub;

import static io.grpc.Status.INVALID_ARGUMENT;

public class HubServerImpl extends HubServiceGrpc.HubServiceImplBase {

	/* Server Implementation */
	private Hub hub;

	public HubServerImpl(String recIP, int recPORT) {
		super();
		this.hub = new Hub(recIP, recPORT);
	}

	@Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
		String input = request.getInput();
		
		if (input == null || input.isBlank()) {
			responseObserver.onError(INVALID_ARGUMENT
				.withDescription("Input cannot be empty!").asRuntimeException());	

		} else {
			String output = "Hello " + input + "! " + HubMain.identity();
			PingResponse response = PingResponse.newBuilder().setOutput(output).build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			
		}
	}

	@Override
	public void sysStatus(SysStatusRequest request, StreamObserver<SysStatusResponse> responseObserver) {
		responseObserver.onNext(hub.getAllServerStatus());
		responseObserver.onCompleted();
	}
    
}