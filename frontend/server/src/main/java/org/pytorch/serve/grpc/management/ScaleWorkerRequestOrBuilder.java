// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: management.proto

package org.pytorch.serve.grpc.management;

public interface ScaleWorkerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.pytorch.serve.grpc.management.ScaleWorkerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of model to scale workers.
   * </pre>
   *
   * <code>string model_name = 1;</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <pre>
   * Name of model to scale workers.
   * </pre>
   *
   * <code>string model_name = 1;</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <pre>
   * Model version.
   * </pre>
   *
   * <code>string model_version = 2;</code>
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   * <pre>
   * Model version.
   * </pre>
   *
   * <code>string model_version = 2;</code>
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString
      getModelVersionBytes();

  /**
   * <pre>
   * Maximum number of worker processes.
   * </pre>
   *
   * <code>int32 max_worker = 3;</code>
   * @return The maxWorker.
   */
  int getMaxWorker();

  /**
   * <pre>
   * Minimum number of worker processes.
   * </pre>
   *
   * <code>int32 min_worker = 4;</code>
   * @return The minWorker.
   */
  int getMinWorker();

  /**
   * <pre>
   * Number of GPU worker processes to create.
   * </pre>
   *
   * <code>int32 number_gpu = 5;</code>
   * @return The numberGpu.
   */
  int getNumberGpu();

  /**
   * <pre>
   * Decides whether the call is synchronous or not, default: false.
   * </pre>
   *
   * <code>bool synchronous = 6;</code>
   * @return The synchronous.
   */
  boolean getSynchronous();

  /**
   * <pre>
   * Waiting up to the specified wait time if necessary for a worker to complete all pending requests. Use 0 to terminate backend worker process immediately. Use -1 for wait infinitely.
   * </pre>
   *
   * <code>int32 timeout = 7;</code>
   * @return The timeout.
   */
  int getTimeout();
}
