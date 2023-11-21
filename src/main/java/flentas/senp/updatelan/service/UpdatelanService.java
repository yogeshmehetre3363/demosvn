package flentas.senp.updatelan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import flentas.senp.updatelan.dto.OutputResponseDto;
import flentas.senp.updatelan.dto.UpdatelanDto;
import flentas.senp.updatelan.dto.UserContext;
import flentas.senp.updatelan.exception.CustomException;
import flentas.senp.updatelan.messages.Messages;
import flentas.senp.updatelan.model.BsaInitiateTransactionResponseModel;
import flentas.senp.updatelan.model.BsaOnlineGenerateLinkRequestModel;
import flentas.senp.updatelan.model.CredlinkGstCallBackRequestModel;
import flentas.senp.updatelan.model.CredlinkGstRequestModel;
import flentas.senp.updatelan.model.CredlinkGstResponseModel;
import flentas.senp.updatelan.model.ItrOnlineStartTransactionResponseModel;
import flentas.senp.updatelan.model.ItrStartTransactionResponseModel;
import flentas.senp.updatelan.model.LogTbStartTransactionResMaster;
import flentas.senp.updatelan.model.PostgstPdfParsingResponseModel;
import flentas.senp.updatelan.repository.BsaCallbackRequestRepository;
import flentas.senp.updatelan.repository.BsaInitiateTransactionRequestRepository;
import flentas.senp.updatelan.repository.BsaInitiateTransactionResponseRepository;
import flentas.senp.updatelan.repository.BsaOnlineCallbackRequestRepository;
import flentas.senp.updatelan.repository.BsaOnlineGenerateLinkRequestRepository;
import flentas.senp.updatelan.repository.BsaOnlineGenerateLinkResponseRepository;
import flentas.senp.updatelan.repository.CredlinkGstCallBackRequestRepository;
import flentas.senp.updatelan.repository.CredlinkGstRequestRepository;
import flentas.senp.updatelan.repository.CredlinkGstResponseRepository;
import flentas.senp.updatelan.repository.ItrCallbackRequestRepository;
import flentas.senp.updatelan.repository.ItrOnlineCallbackRequestRepository;
import flentas.senp.updatelan.repository.ItrOnlineStartTransactionRepository;
import flentas.senp.updatelan.repository.ItrOnlineStartTransactionResponseRepository;
import flentas.senp.updatelan.repository.ItrStartTransactionRequestRepository;
import flentas.senp.updatelan.repository.ItrStartTransactionResponseRepository;
import flentas.senp.updatelan.repository.PatchPdfparsingRequestRepository;
import flentas.senp.updatelan.repository.PostgstPdfParsingRequestRepository;
import flentas.senp.updatelan.repository.PostgstPdfParsingResponseRepository;
import flentas.senp.updatelan.repository.StartTransactionReqRepository;
import flentas.senp.updatelan.repository.StartTransactionResRepository;
//import flentas.senp.updatelan.utility.ApiCalling;
import flentas.senp.updatelan.utility.Constants;
import flentas.senp.updatelan.utility.ResponseEntityGenerator;

@Service
public class UpdatelanService {

	@Autowired
	UserContext userContext;
	@Autowired
	ResponseEntityGenerator responseEntityGenerator;
	@Autowired
	Messages messages;

	@Autowired
	StartTransactionReqRepository startTransactionReqRepository;
	@Autowired
	StartTransactionResRepository startTransactionResRepository;
	@Autowired
	ItrStartTransactionRequestRepository itrStartTransactionRequestRepository;
	@Autowired
	ItrStartTransactionResponseRepository itrStartTransactionResponseRepository;
   @Autowired
   ItrOnlineStartTransactionRepository itrOnlineStartTransactionRepository;
   @Autowired
   ItrOnlineStartTransactionResponseRepository itrOnlineStartTransactionResponseRepository;
   @Autowired
   ItrOnlineCallbackRequestRepository itrOnlineCallbackRequestRepository;
   
	@Autowired
	CredlinkGstRequestRepository credlinkGstRequestRepository;
	@Autowired
	CredlinkGstResponseRepository credlinkGstResponseRepository;

	@Autowired
	CredlinkGstCallBackRequestRepository credlinkGstCallBackRequestRepository;
	@Autowired
	ItrCallbackRequestRepository itrCallbackRequestRepository;

	@Autowired
	PostgstPdfParsingRequestRepository postgstPdfParsingRequestRepository;

	@Autowired
	PostgstPdfParsingResponseRepository postgstPdfParsingResponseRepository;
	@Autowired
	PatchPdfparsingRequestRepository patchPdfparsingRequestRepository;
	
	@Autowired
	BsaInitiateTransactionRequestRepository bsaInitiateTransactionRequestRepository;
	@Autowired
    BsaInitiateTransactionResponseRepository  bsaInitiateTransactionResponseRepository;
	@Autowired
	BsaCallbackRequestRepository  bsaCallbackRequestRepository;
	
	@Autowired
	BsaOnlineCallbackRequestRepository  bsaOnlineCallbackRequestRepository;
	@Autowired
	BsaOnlineGenerateLinkRequestRepository bsaOnlineGenerateLinkRequestRepository; 
	@Autowired
	BsaOnlineGenerateLinkResponseRepository bsaOnlineGenerateLinkResponseRepository;
//	@Autowired
//	ApiCalling apiCalling;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public OutputResponseDto updatelanService(UpdatelanDto updatelanDto) {
		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
			+"Service "	+ " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + " | " + new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "updatelanService");

		try {
//			JSONObject json = new JSONObject();
//			json.put("lan_id", updatelanDto.getLan_id());
//			json.put("username", updatelanDto.getUsername());

			
			for (int j = 0; j < updatelanDto.getServices().size(); j++) {

				// For ITR
				if (updatelanDto.getServices().get(j).getService().equals("ITR")) {
					
					String perfiosTransactionId = updatelanDto.getServices().get(j).getRequest_id();
					
					logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- ITR " +" transactionId:- "
					+ perfiosTransactionId + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));
					
					
				
					
					ItrStartTransactionResponseModel itrStartTransactionResponseModel = itrStartTransactionResponseRepository
							.findByTransactionId(perfiosTransactionId);

					if(itrStartTransactionResponseModel==null) {
						return new OutputResponseDto(false, null,messages.get("Itr.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
								userContext.getTraceId());
					}
					logger.info("data retrieved from ITR response repository "+ itrStartTransactionResponseModel );
					
					int itr_startTransaction_id = itrStartTransactionResponseModel.getItrStartTransactionRequest()
							.getItr_startTransaction_id();
					// itrRequest Table update
					int requestResultItr = itrStartTransactionRequestRepository.updateById(itr_startTransaction_id,
							updatelanDto.getLan_id(),updatelanDto.getCif());
					if (requestResultItr >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "ItrRequestUpdated");
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "itrRequestNotUpdated");
					}
					// itrResponse table update
					int responseResultItr = itrStartTransactionResponseRepository
							.updateByTransactionId(perfiosTransactionId, updatelanDto.getLan_id(),updatelanDto.getCif());
					if (responseResultItr >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "ItrResponseUpdated");
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "itrResponseNotUpdated");
					}
					// itrRequest Callback table update
					String perfiosTransaction_Id = updatelanDto.getServices().get(j).getRequest_id();
					int responseResult_Itr = itrCallbackRequestRepository.updateById(perfiosTransaction_Id,
							updatelanDto.getLan_id(),updatelanDto.getCif());
					if (responseResult_Itr >= 1)
					{
						
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "ItrCallbackUpdated");

//						return new OutputResponseDto(true, null, messages.get("SuccessfullItr.message"),
//								messages.getStatusCode("SuccessfullItr.StatusCode"), userContext.getTraceId());

					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "itrCallbackNotUpdated");
//						return new OutputResponseDto(false, null, messages.get("FailureItr.message"),
//								messages.getStatusCode("FailureItr.StatusCode"), userContext.getTraceId());
					}
				}

				//ITR-ONLINE
				
				if (updatelanDto.getServices().get(j).getService().equals("ITR-ONLINE")) {
					
					String perfiosTransactionId = updatelanDto.getServices().get(j).getRequest_id();
					
					logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- ITR-ONLINE " +" transactionId:- "
					+ perfiosTransactionId + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));
					
				
				
					
					ItrOnlineStartTransactionResponseModel itrOnlineStartTransactionResponseModel = itrOnlineStartTransactionResponseRepository
							.findByTransactionId(perfiosTransactionId);

					if(itrOnlineStartTransactionResponseModel==null) {
						return new OutputResponseDto(false, null,messages.get("Itr.Online.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
								userContext.getTraceId());
					}
					logger.info("data retrieved from ITR Online response repository "+ itrOnlineStartTransactionResponseModel );
					
					int itr_startTransaction_id = itrOnlineStartTransactionResponseModel.getItrOnlineStartTransactionRequest().getItr_startTransaction_id();
					// itrOnlineRequest Table update
					int requestResultItrOnline = itrOnlineStartTransactionRepository.updateById(itr_startTransaction_id,
							updatelanDto.getLan_id(),updatelanDto.getCif());
					if (requestResultItrOnline >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "ItrOnlineRequestUpdated");
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "itrOnlineRequestNotUpdated");
					}
					// itrOnlineResponse table update
					int responseResultItrOnline = itrOnlineStartTransactionResponseRepository
							.updateByTransactionId(perfiosTransactionId, updatelanDto.getLan_id(),updatelanDto.getCif());
					if (responseResultItrOnline >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "ItrOnlineResponseUpdated");
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "itrOnlineResponseNotUpdated");
					}
					// itrRequest Callback table update
					
					int responseResult_Itr_online = itrOnlineCallbackRequestRepository.updateById(perfiosTransactionId,
							updatelanDto.getLan_id(),updatelanDto.getCif());
					if (responseResult_Itr_online >= 1)
					{
						
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "ItrOnlineCallbackUpdated");

//						return new OutputResponseDto(true, null, messages.get("SuccessfullItr.message"),
//								messages.getStatusCode("SuccessfullItr.StatusCode"), userContext.getTraceId());

					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "itrOnlineCallbackNotUpdated");
//						return new OutputResponseDto(false, null, messages.get("FailureItr.message"),
//								messages.getStatusCode("FailureItr.StatusCode"), userContext.getTraceId());
					}
				}

				// For FSA
				if (updatelanDto.getServices().get(j).getService().equals("FSA")) {
					String sperfiostransactionid = updatelanDto.getServices().get(j).getRequest_id();
//				
					logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- FSA " +" transactionId:- "
							+ sperfiostransactionid + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));

					LogTbStartTransactionResMaster logTbStartTransactionResMaster = startTransactionResRepository
							.findByPerfiosId(sperfiostransactionid);

					if(logTbStartTransactionResMaster==null) {
						return new OutputResponseDto(false, null,messages.get("Fsa.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
								userContext.getTraceId());
					}
					logger.info("data retrieved from FSA response repository "+ logTbStartTransactionResMaster );
//							int nreqtransactionid=	logTbStartTransactionResMaster.getLogTbStartTransactionReqMaster().getNreqtransactionid();
					long nreqtransactionid = logTbStartTransactionResMaster.getLogTbStartTransactionReqMaster()
							.getNreqtransactionid();

					
					// FSARequest Table updated
					int requestResultFsa = startTransactionReqRepository.updateById(nreqtransactionid,
							updatelanDto.getLan_id(),updatelanDto.getCif());
					if (requestResultFsa >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "FsaResponseUpdated");

//					return new OutputResponseDto(true, null,messages.get("SuccessfullFsa.message"),messages.getStatusCode("SuccessfullFsa.StatusCode"),
//								userContext.getTraceId());
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "FsaResponseNotUpdated");

					}

					// FSAResponse table updated

					int responseResultFsa = startTransactionResRepository.updateByTransactionId(sperfiostransactionid,
							updatelanDto.getLan_id(),updatelanDto.getCif());
				
					if (responseResultFsa >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "FsaResponseUpdated");
//						return new OutputResponseDto(true, null, messages.get("SuccessfullFsa.message"),
//								messages.getStatusCode("SuccessfullFsa.StatusCode"), userContext.getTraceId());
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "FsaResponseNotUpdated");

					}
				} //end of FSA

				
				
				
				// For GST

				if (updatelanDto.getServices().get(j).getService().equals("GST")) {

					// PostPDF

					String Transaction_Id = updatelanDto.getServices().get(j).getRequest_id();

					logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- GST PdfParsing " +" transactionId:- "
							+ Transaction_Id + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));

						PostgstPdfParsingResponseModel postgstPdfParsingResponseModel = postgstPdfParsingResponseRepository
								.findByRequestid(Transaction_Id);
						//if no data found
						if(postgstPdfParsingResponseModel==null) {
							return new OutputResponseDto(false, null,messages.get("Gst.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
									userContext.getTraceId());
						}
						logger.info("data retrieved from GSTPostPdf response repository "+ postgstPdfParsingResponseModel );
						
						int postPdfReqId = postgstPdfParsingResponseModel.getPostgstPdfParsingRequestModel()
								.getPostPdfReqId();
						
						// PostPDFRequest Table update
						int requestResultGst = postgstPdfParsingRequestRepository.updateByRequestId(postPdfReqId,
								updatelanDto.getLan_id(),updatelanDto.getCif());
						if (requestResultGst >= 1) {
							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "GstPostRequestUpdated");
//								return new OutputResponseDto(true, requestResultGst,messages.get("SuccessfullGst.message"),messages.getStatusCode("SuccessfullGst.StatusCode"),
//										userContext.getTraceId());
						} else {
							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "GstPostRequestNotUpdated");

						}
						// PostPDFResponse table update
						int responseResultGstPost = postgstPdfParsingResponseRepository
								.updateByRequestId(Transaction_Id, updatelanDto.getLan_id(),updatelanDto.getCif());
		
						if (responseResultGstPost >= 1) {
						
							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "GstPdfResponseUpdated");
						
						} else {

							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "GstPdfResponseNotUpdated");
						}
						//patchPdfRequest Table Update
						
						int responsePatchResultGst = patchPdfparsingRequestRepository
								.updateByRequestId(Transaction_Id, updatelanDto.getLan_id(),updatelanDto.getCif());
		
						if (responsePatchResultGst >= 1) {
						
							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "GstPatchResponseUpdated");
						
						} else {

							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "GstPatchResponseNotUpdated");
						}

					
				}//end of GST
				
				// Credlink

				// CredlinkCallbackRequest Table update

				if (updatelanDto.getServices().get(j).getService().equals("GST-CRED")) {
					String requestid = updatelanDto.getServices().get(j).getRequest_id();
					
					logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- GST Credlink " +" transactionId:- "
							+ requestid + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));

					
					CredlinkGstResponseModel   credlinkGstResponseModel=credlinkGstResponseRepository.findByRequestid(requestid); 
					if(credlinkGstResponseModel==null) {
						return new OutputResponseDto(false, null,messages.get("Gst.credlink.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
								userContext.getTraceId());
					}
					
					int credlinkReqId=	credlinkGstResponseModel.getCredlinkGstRequestModel().getCredlinkReqId();
					
					int requestResultGst=	credlinkGstRequestRepository.updateById(credlinkReqId,updatelanDto.getLan_id(),updatelanDto.getCif());
				   	if(requestResultGst>=1) {
				   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "GstCredlinkRequestUpdated" );
				   	}else {
				   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "GstCredlinkRequestNotUpdated" );
				   	}
				   	
				   	//GstResponse table updated
				    int responseCredlinkResultGst=	credlinkGstResponseRepository.updateByRequestId(requestid,updatelanDto.getLan_id(),updatelanDto.getCif());
				   	if(responseCredlinkResultGst>=1) {
				   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "GstCredlinkResponseUpdated" );
				   	}else {
				   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "GstCredlinkResponseNotUpdated" );
				   	}
					
					//update callback
					int responseResultGstCredlinkCallback = credlinkGstCallBackRequestRepository.updateById(requestid,
							updatelanDto.getLan_id(),updatelanDto.getCif());
					if (responseResultGstCredlinkCallback >= 1) {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "GstCredlinkCallBackUpdated");

					
					} else {
						logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
								+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
								+ "GstCredlinkCallBackNotUpdated");
						
					}
				}//end of GST-CRED
				
				//BSA
				if (updatelanDto.getServices().get(j).getService().equals("BSA")) {
				String transactionId = updatelanDto.getServices().get(j).getRequest_id();
				
				logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- BSA " +" transactionId:- "
						+ transactionId + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));

				
				BsaInitiateTransactionResponseModel   bsaInitiateTransactionResponseModel=bsaInitiateTransactionResponseRepository.findByTransactionId(transactionId); 
				if(bsaInitiateTransactionResponseModel==null) {
					return new OutputResponseDto(false, null,messages.get("Bsa.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
							userContext.getTraceId());
				}
				
				int initiatetransactionreqid=	bsaInitiateTransactionResponseModel.getBsaInitiateTransactionRequestModel().getInitiateTransactionReqId();
				
				int requestResultBsa=	bsaInitiateTransactionRequestRepository.updateById(initiatetransactionreqid,updatelanDto.getLan_id(),updatelanDto.getCif());
			   	if(requestResultBsa>=1) {
			   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
							+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "BsaInitTransactionRequestUpdated" );
			   	}else {
			   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
							+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "BsaInitTransactionRequestNotUpdated" );
			   	}
			   	
			   	//RequestResponse table updated
			    int responseBsaResult=	bsaInitiateTransactionResponseRepository.updateByTransactionId(transactionId,updatelanDto.getLan_id(),updatelanDto.getCif());
			   	if(responseBsaResult>=1) {
			   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
							+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "BsaInitTransactionResponseUpdated" );
			   	}else {
			   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
							+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "BsaInitTransactionResponseNotUpdated" );
			   	}
				
				//update Bsa callback
				int responseResultBsaCallback = bsaCallbackRequestRepository.updateById(transactionId,
						updatelanDto.getLan_id(),updatelanDto.getCif());
				if (responseResultBsaCallback >= 1) {
					logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
							+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
							+ "BsaCallBackUpdated");

				
				} else {
					logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
							+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
							+ "BsaCallBackNotUpdated");
					
				}
			}//end of BSA

			//BSA Online 
				//BSA
				if (updatelanDto.getServices().get(j).getService().equals("BSA-ONLINE")) 
				{
						String transactionId = updatelanDto.getServices().get(j).getRequest_id();
						
						logger.info("Info "+" | " + "service " + " | "+ "updateLanAndCifInMw" + " | " +"Service:- BSA-ONLINE " +" transactionId:- "
								+ transactionId + " | " + " Lan:- "+ updatelanDto.getLan_id() + " | " + " cif:- "+ updatelanDto.getCif() + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()));
		
						
//						BsaOnlineGenerateLinkRequestModel bsaOnlineGenerateLinkRequestModel=bsaOnlineGenerateLinkRequestRepository.findByClientId(transactionId); 
//						System.out.println("data ");
//						if(bsaOnlineGenerateLinkRequestModel==null) {
//							return new OutputResponseDto(false, null,messages.get("Bsa.Online.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
//									userContext.getTraceId());
//						}
						
		        
						
						int requestResultBsaOnline=	bsaOnlineGenerateLinkRequestRepository.updateById(transactionId,updatelanDto.getLan_id(),updatelanDto.getCif());
					   	if(requestResultBsaOnline>=1) {
					   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "BsaOnlineGenerateRequestUpdated" );
					   	}else {
					   		logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "BsaOnlineGenerateRequestNotUpdated" );

					   		return new OutputResponseDto(false, null,messages.get("Bsa.Online.provided.Invalid.RequestId"),messages.getStatusCode("FailureGst.StatusCode"),
									userContext.getTraceId());
					   							   	}
					   	
					   
						
						//update BsaOnline callback
						int responseResultBsaOnlineCallback = bsaCallbackRequestRepository.updateByClientId(transactionId,
								updatelanDto.getLan_id(),updatelanDto.getCif());
						if (responseResultBsaOnlineCallback >= 1) {
							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "BsaOnlineCallBackUpdated");
		
						
						} else {
							logger.info("INFO" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
									+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|"
									+ "BsaOnlineCallBackNotUpdated");
							
						}
			}//end of BSA-Online


		}//end of for loop

			return new OutputResponseDto(true, null, "data updated",
					messages.getStatusCode("SuccessfullFsa.StatusCode"), userContext.getTraceId());
		} catch (Exception e) {
			logger.error("ERROR" + "|" + new SimpleDateFormat("ddMMyyyy").format(new Date()) + "|"
					+ new SimpleDateFormat("HHmm").format(new Date()) + "|" + "Service" + "|" + "UpdatelanService"
					+ e.getMessage());
			throw new CustomException(Constants.customException, Constants.booleanFalse,
					messages.getStatusCode("senp.updatelan.failure.invalidInput.message.id"), e.getMessage(),
					responseEntityGenerator.getSCodeFromStatusCode(
							messages.getStatusCode("senp.updatelan.failure.invalidInput.message.id")),
					userContext.getTraceId());
		}

	}

}
