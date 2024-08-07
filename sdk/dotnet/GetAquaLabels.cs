// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec
{
    public static class GetAquaLabels
    {
        /// <summary>
        /// The data source `aquasec.getAquaLabels` provides a method to query all aqua labels within the Aqua account management.The fields returned from this query are detailed in the Schema section below.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var aquaLabels = Aquasec.GetAquaLabels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["scopes"] = aquaLabels,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAquaLabelsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAquaLabelsResult>("aquasec:index/getAquaLabels:getAquaLabels", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// The data source `aquasec.getAquaLabels` provides a method to query all aqua labels within the Aqua account management.The fields returned from this query are detailed in the Schema section below.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var aquaLabels = Aquasec.GetAquaLabels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["scopes"] = aquaLabels,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAquaLabelsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAquaLabelsResult>("aquasec:index/getAquaLabels:getAquaLabels", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetAquaLabelsResult
    {
        public readonly ImmutableArray<Outputs.GetAquaLabelsAquaLabelResult> AquaLabels;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAquaLabelsResult(
            ImmutableArray<Outputs.GetAquaLabelsAquaLabelResult> aquaLabels,

            string id)
        {
            AquaLabels = aquaLabels;
            Id = id;
        }
    }
}
